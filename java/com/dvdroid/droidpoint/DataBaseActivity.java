package com.dvdroid.droidpoint;

/**
 * Created by darshanh on 30/11/15.
 */


import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by darshanh on 17/11/15.
 */
public class DataBaseActivity extends Activity {
    EditText editRollno, editName, editMarks;
    Button btnAdd, btnDelete, btnModify, btnView, btnViewAll, btnShowInfo;
    SQLiteDatabase db;

    // private InterstitialAd interstitial;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.database);


        editRollno = (EditText) findViewById(R.id.roll);
        editName = (EditText) findViewById(R.id.name);
        editMarks = (EditText) findViewById(R.id.marks);
        btnAdd = (Button) findViewById(R.id.add);
        btnDelete = (Button) findViewById(R.id.delete);
        btnModify = (Button) findViewById(R.id.modify);
        btnView = (Button) findViewById(R.id.view);
        btnViewAll = (Button) findViewById(R.id.viewall);
        btnShowInfo = (Button) findViewById(R.id.show);


// Registering event handlers
        db = openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(rollno VARCHAR,name VARCHAR,marks VARCHAR);");
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editRollno.getText().toString().trim().length() == 0 ||
                        editName.getText().toString().trim().length() == 0 ||
                        editMarks.getText().toString().trim().length() == 0) {
                    showMessage("Error", "Please enter all values");
                    return;
                }
                db.execSQL("INSERT INTO student VALUES('" + editRollno.getText() + "','" + editName.getText() +
                        "','" + editMarks.getText() + "');");
                showMessage("Success", "Record added");
                clearText();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editRollno.getText().toString().trim().length() == 0) {
                    showMessage("Error", "Please enter Rollno");
                    return;
                }
                Cursor c = db.rawQuery("SELECT * FROM student WHERE rollno='" + editRollno.getText() + "'", null);
                if (c.moveToFirst()) {
                    db.execSQL("DELETE FROM student WHERE rollno='" + editRollno.getText() + "'");
                    showMessage("Success", "Record Deleted");
                } else {
                    showMessage("Error", "Invalid Rollno");
                }
                clearText();
            }
        });

        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editRollno.getText().toString().trim().length() == 0) {
                    showMessage("Error", "Please enter Rollno");
                    return;
                }
                Cursor c = db.rawQuery("SELECT * FROM student WHERE rollno='" + editRollno.getText() + "'", null);
                if (c.moveToFirst()) {
                    editName.setText(c.getString(1));
                    editMarks.setText(c.getString(2));
                } else {
                    showMessage("Error", "Invalid Rollno");
                    clearText();
                }
            }
        });

        btnModify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editRollno.getText().toString().trim().length() == 0) {
                    showMessage("Error", "Please enter Rollno");
                    return;
                }
                // Searching roll number
                Cursor c = db.rawQuery("SELECT * FROM student WHERE rollno='" + editRollno.getText() + "'", null);
                if (c.moveToFirst()) {
                    // Modifying record if found
                    db.execSQL("UPDATE student SET name='" + editName.getText() + "',marks='" + editMarks.getText() +
                            "' WHERE rollno='" + editRollno.getText() + "'");
                    showMessage("Success", "Record Modified");
                } else {
                    showMessage("Error", "Invalid Rollno");
                }
                clearText();
            }
        });

        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c = db.rawQuery("SELECT * FROM student", null);
                if (c.getCount() == 0) {
                    showMessage("Error", "No records found");
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (c.moveToNext()) {
                    buffer.append("Roll Number: " + c.getString(0) + "\n");
                    buffer.append("Name: " + c.getString(1) + "\n");
                    buffer.append("Marks: " + c.getString(2) + "\n\n");
                }
                showMessage("Student Details", buffer.toString());
            }
        });
// Creating database and table

        btnShowInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage("Student Management Application", "Developed By Darshan");
            }
        });
    }

    public void showMessage(String title, String message) {
        Builder builder = new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    public void clearText() {
        editRollno.setText("");
        editName.setText("");
        editMarks.setText("");
        editRollno.requestFocus();
    }

}

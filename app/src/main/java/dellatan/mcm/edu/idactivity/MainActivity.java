package dellatan.mcm.edu.idactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvID;
    TextView tvName;
    TextView tvSex;
    TextView tvAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvID = findViewById(R.id.txt_Id);
        tvName = findViewById(R.id.txt_name);
        tvSex = findViewById(R.id.txt_sex);
        tvAge = findViewById(R.id.txt_age);


        int startingID = 20200000;

        Student kyle = new Student(startingID++,"Kyle","Dellatan",'M',18);

        kyle.setStudentID(startingID);
        kyle.setStudentFname("Kyle");
        kyle.setStudentLname("Dellatan");
        kyle.setStudentSex('M');
        kyle.setStudentAge(18);


        tvName.setText(kyle.getStudentFname()+" "+kyle.getStudentLname());
        tvID.setText(String.valueOf(kyle.getStudentID()));
        tvSex.setText(String.valueOf(kyle.getStudentSex()));
        tvAge.setText(String.valueOf(kyle.getStudentAge()));
    }
}

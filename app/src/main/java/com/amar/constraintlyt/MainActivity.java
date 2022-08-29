package com.amar.constraintlyt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.amar.constraintlyt.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Contact> contactList = new ArrayList<>();
    ActivityMainBinding activityMainBinding;
    private RecyclerViewAdapterBt mAdapterBt;
//    private RecyclerView recyclerView;
//    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Implementing ViewBinding
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        contactListData();

//        recyclerView = findViewById(R.id.rvContacts);
        activityMainBinding.rvContacts.setHasFixedSize(true);
        activityMainBinding.rvContacts.setLayoutManager(new LinearLayoutManager(this));
        mAdapterBt = new RecyclerViewAdapterBt(contactList, MainActivity.this);
        mAdapterBt = new RecyclerViewAdapterBt(contactList, MainActivity.this);

//        activityMainBinding.rvContacts.setAdapter(mAdapter);
        activityMainBinding.rvContacts.setAdapter(mAdapterBt);

        activityMainBinding.floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contact contact7 = new Contact(6, "Manoj Kumar","15,June,2022", "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg");
                contactList.add(contact7);
                mAdapterBt.setData(contactList);
            }
        });
    }

    private void contactListData() {
        Contact contact1 = new Contact(0, "Terry Mango", "Today", "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg");
        Contact contact2 = new Contact(1, "Ann Dias", "12,July,2022", "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg");
        Contact contact3 = new Contact(2, "Jordyn Bothman", "20,June,2022", "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg");
        Contact contact4 = new Contact(3, "Rishi Sunak", "18,June,2022", "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg");
        Contact contact5 = new Contact(4, "Surya Prakash", "18,June,2022", "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg");
        Contact contact6 = new Contact(5, "Mahinder", "18,June,2022", "https://png.pngtree.com/png-vector/20190710/ourmid/pngtree-user-vector-avatar-png-image_1541962.jpg");
        contactList.addAll(Arrays.asList(contact1,contact2,contact3,contact4,contact5,contact6));
    }
}

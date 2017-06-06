package ru.sberbank.user7.listoffiles;

import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.io.File;

/**
 * Created by user7 on 06.06.2017.
 */

public class DirectoryAdapter extends BaseAdapter {
    private File[] files;
    public DirectoryAdapter(){
        File rootDirectory  = Environment.getRootDirectory();
        Log.e("extstor",rootDirectory.toString());
        Log.e("readable", String.valueOf(rootDirectory.canRead()));
        files = rootDirectory.listFiles();
        Log.e("files", String.valueOf(files.length));
        for(File f:files){
            Log.e("files",f.toString());
        }

    }

    @Override
    public int getCount() {
        return files.length;
    }

    @Override
    public File getItem(int position) {
        return files[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_for_directory, parent, false);
        TextView nameOfDirView = (TextView) view.findViewById(R.id.nameOfDirectory);
        nameOfDirView.setText(getItem(position).getName().toString());
        return view;
    }
}

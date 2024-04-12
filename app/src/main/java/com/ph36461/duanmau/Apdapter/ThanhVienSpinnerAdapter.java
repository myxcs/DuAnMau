package com.ph36461.duanmau.Apdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import com.ph36461.duanmau.Model.ThanhVien;
import com.ph36461.duanmau.R;
public class ThanhVienSpinnerAdapter extends ArrayAdapter<ThanhVien> {

    private Context context;
    private ArrayList<ThanhVien> lstTV;

    TextView tv_maLoai,tv_tenLoai;

    public ThanhVienSpinnerAdapter(@NonNull Context context, int resource, ArrayList<ThanhVien> lstTV) {
        super(context, resource,lstTV);
        this.context = context;
        this.lstTV = lstTV;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_spinner,parent,false);
        final ThanhVien thanhVien = lstTV.get(position);

        if (thanhVien != null) {
            tv_maLoai = convertView.findViewById(R.id.tv_maLoai);
            tv_maLoai.setText(String.valueOf(thanhVien.getMaTV()));
            tv_tenLoai = convertView.findViewById(R.id.tv_tenLoai);
            tv_tenLoai.setText(thanhVien.getHoTen());
        }

        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_spinner_selected,parent,false);
        final ThanhVien thanhVien = lstTV.get(position);

        if (thanhVien != null) {
            tv_maLoai = convertView.findViewById(R.id.tv_maLoai);
            tv_maLoai.setText(String.valueOf(thanhVien.getMaTV()));
            tv_tenLoai = convertView.findViewById(R.id.tv_tenLoai);
            tv_tenLoai.setText(thanhVien.getHoTen());
        }
        return convertView;
    }
}

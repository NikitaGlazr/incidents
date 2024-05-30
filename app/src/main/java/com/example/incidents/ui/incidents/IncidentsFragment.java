package com.example.incidents.ui.incidents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.incidents.databinding.FragmentIncidentsBinding;

public class IncidentsFragment extends Fragment {

    private FragmentIncidentsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        IncidentsViewModel galleryViewModel =
                new ViewModelProvider(this).get(IncidentsViewModel.class);

        binding = FragmentIncidentsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
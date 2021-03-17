package com.example.technovationtestproject;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.fragment.NavHostFragment;
import com.example.technovationtestproject.databinding.FragmentCameraBinding;

/**
 * A simple {@link Fragment} subclass. Use the {@link CameraFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CameraFragment extends Fragment {

  private FragmentCameraBinding binding;

  public CameraFragment() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    binding = FragmentCameraBinding.inflate(inflater, container, false);
    return binding.getRoot();
  }

  public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
      super.onViewCreated(view, savedInstanceState);

      binding.homeButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
          NavHostFragment.findNavController(CameraFragment.this)
              .navigate(R.id.action_CameraFragment_to_FirstFragment);
        }
      });
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    binding = null;
  }
}


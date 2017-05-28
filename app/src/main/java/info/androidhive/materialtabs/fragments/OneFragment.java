package info.androidhive.materialtabs.fragments;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment implements View.OnClickListener
{

    Button button;

//    Button b = (Button)findVi

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        button = (Button) getView().findViewById(R.id.button);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("mako", "shaba");
//            }
//        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        View view = inflater.inflate(R.layout.fragment_one, container, false);
        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(this);
        return view;



//        return inflater.inflate(R.layout.fragment_one, container, false);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:


                ModalFragment modal = new ModalFragment();

                Log.d("mako", "tkt : "+modal);

//                FragmentManager manager = getChildFragmentManager();


//                DialogFragment dialogFragment = new DialogFragment ();
                modal.show(getActivity().getFragmentManager(),"simple dialog");

//                seven.show(manager, "tag");

//                ExampleDialogFragment dialog = new ExampleDialogFragment ();
//                seven .show(getFragmentManager(), "example");

//                FragmentTransaction transaction = manager.beginTransaction();
//                transaction.replace(R.id.viewpager, seven);
//                transaction.commit();





                break;

        }
    }
}

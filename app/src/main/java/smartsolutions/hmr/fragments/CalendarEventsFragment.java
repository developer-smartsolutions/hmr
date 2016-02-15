package smartsolutions.hmr.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import smartsolutions.hmr.R;

/**
 * Created by ruchadeshmukh on 1/17/16.
 */
public class CalendarEventsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
    }

    @Override
    public void onActivityCreated(Bundle savedInstance){
        super.onActivityCreated(savedInstance);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View rootView = inflater.inflate(R.layout.fragment_calendar_events, container, false);
        return rootView;
    }
}

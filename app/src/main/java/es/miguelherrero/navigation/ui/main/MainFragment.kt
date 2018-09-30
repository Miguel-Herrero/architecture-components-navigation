package es.miguelherrero.navigation.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import es.miguelherrero.navigation.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)


        btn_play.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_playFragment)
        }

        btn_choose_topic.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_topicFragment)
        }

        NavHostFragment.findNavController(this).addOnNavigatedListener { controller, destination ->
            when (destination.id) {
                R.id.topicFragment -> {
                    Toast.makeText(context, "Did you know…?", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}

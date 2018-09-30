package es.miguelherrero.navigation.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import es.miguelherrero.navigation.R
import kotlinx.android.synthetic.main.topic_fragment.*

class TopicFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.topic_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val action = TopicFragmentDirections.actionTopicFragmentToPlayFragment()

        btn_topic_sports.setOnClickListener {
            action.setName("Sports")
            Navigation.findNavController(it).navigate(action)
        }

        btn_topic_science.setOnClickListener {
            action.setName("Science")
            Navigation.findNavController(it).navigate(action)
        }

        btn_topic_history.setOnClickListener {
            /*action.setName("History")
            Navigation.findNavController(it).navigate(action)*/
            Navigation.findNavController(it).navigate(R.id.action_global_loginFragment)
        }
    }
}
package com.example.kurianvithayathil.keddit.kedditbysteps.news

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kurianvithayathil.keddit.kedditbysteps.R
import com.example.kurianvithayathil.keddit.kedditbysteps.commons.inflate
import kotlinx.android.synthetic.main.news_fragment.*

/**
 * Created by kurianvithayathil on 12/21/17.
 */
class NewsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.news_fragment)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)
    }
}
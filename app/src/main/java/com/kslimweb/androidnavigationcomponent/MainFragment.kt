package com.kslimweb.androidnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(), View.OnClickListener {

//    setup navController in Fragment instead of Activity
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        view_transactions_btn.setOnClickListener(this)
        send_money_btn.setOnClickListener(this)
        view_balance_btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        // backstack is auto handled
        when (v!!.id) {
            R.id.view_transactions_btn -> navController.navigate(R.id.action_mainFragment_to_viewTransactionFragment)
            R.id.send_money_btn -> navController.navigate(R.id.action_mainFragment_to_chooseRecipientFragment)
            R.id.view_balance_btn -> navController.navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }
    }
}

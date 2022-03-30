package xyz.scoca.assignment5.pages

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import xyz.scoca.assignment5.R
import xyz.scoca.assignment5.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private lateinit var binding : FragmentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater,container,false)

        binding.btnBack.setOnClickListener {
            backToHomePage()
        }
        return binding.root
    }

    private fun backToHomePage(){
        findNavController().navigate(R.id.action_detailFragment_to_homeFragment)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
    }
}
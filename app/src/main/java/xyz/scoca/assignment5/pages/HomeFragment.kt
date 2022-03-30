package xyz.scoca.assignment5.pages

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import xyz.scoca.assignment5.R
import xyz.scoca.assignment5.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        setListViewAdapter()

        binding.btnSetProfilePhoto.setOnClickListener {
            setProfilePhoto()
        }

        binding.btnDetails.setOnClickListener {
            navigateToDetails()
        }
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        menu.clear()
    }

    //Initialize list items and list adapter.
    private fun setListViewAdapter() {
        val languages = arrayOf("C", "Kotlin", "C++", "Java", "C#", "Python")

        val adapter: ArrayAdapter<String> = ArrayAdapter(
            requireContext(), android.R.layout.simple_list_item_1, languages
        )
        binding.lvProgrammingLanguages.adapter = adapter
    }

    private fun setProfilePhoto() {
        binding.ivProfilePhoto.setImageResource(R.drawable.spacemoon)
    }

    // navigate to detail fragment.
    private fun navigateToDetails() {
        findNavController().navigate(R.id.action_homeFragment_to_detailFragment)
    }
}
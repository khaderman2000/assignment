package adepters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment.R;

import models.Element;

public class ElementAdapter extends RecyclerView.Adapter<ElementAdapter.ViewHolder>{



    Element[] elements;
    Context context;

    public ElementAdapter(Element[] elements, Context context) {
        this.elements = elements;
        this.context = context;
    }

    @NonNull
    @Override
    public ElementAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.elements_card_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ElementAdapter.ViewHolder holder, int position) {
        final Element element = elements[position];
        holder.elementName.setText(element.getElementName());
        holder.atomicNumber.setText(String.valueOf(element.getAtomicNumber()));
        holder.atomicMass.setText(String.valueOf(element.getAtomicMass()));
        // holder.elementImage.setImageResource(element.getElementImage());
    }


    @Override
    public int getItemCount() {
        return elements.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView elementName;
        TextView atomicNumber;
        TextView atomicMass;
        ImageView elementImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
          //  elementImage = itemView.findViewById(R.id.elementImage);
            elementName = itemView.findViewById(R.id.elementName);
            atomicNumber = itemView.findViewById(R.id.atomicNumber);
            atomicMass = itemView.findViewById(R.id.atomicMass);
        }
    }
}

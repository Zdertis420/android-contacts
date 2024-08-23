package ru.yandex.practicum.contacts.presentation.base;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T> extends DiffUtil.ItemCallback implements ListDiffInterface {

    @Override
    public boolean areItemsTheSame(@NonNull Object oldItem, @NonNull Object newItem) {
        return oldItem.hashCode() == newItem.hashCode();
    }

    @Override
    public boolean areContentsTheSame(@NonNull Object oldItem, @NonNull Object newItem) {
        return false;
    }

    @Override
    public boolean theSameAs(Object newItem) {
        return this.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull Object oldItem, @NonNull Object newItem) {
        return newItem;
    }
}

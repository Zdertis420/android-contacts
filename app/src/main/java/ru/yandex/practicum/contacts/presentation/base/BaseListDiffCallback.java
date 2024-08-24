package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T> extends DiffUtil.ItemCallback<T> implements ListDiffInterface<T> {

    @Override
    public boolean theSameAs(T newItem) {
        return this.equals(newItem);
    }

    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return oldItem.hashCode() == newItem.hashCode();
    }

    @Override
    public boolean areContentsTheSame(@NonNull Object oldItem, @NonNull Object newItem) {
        return false;
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull Object oldItem, @NonNull Object newItem) {
        return newItem;
    }
}

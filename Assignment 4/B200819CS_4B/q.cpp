#include <bits/stdc++.h>
using namespace std;

// quick sort
void quicksort(vector<int> &v, int left, int right)
{
    if (left >= right)
        return;

    int pivot = right;
    int i = left - 1;

    for (int j = left; j <= right; j++)
    {
        if (v[j] < v[pivot])
        {
            i++;
            swap(v[i], v[j]);
        }
    }
    swap(v[pivot], v[i + 1]);

    quicksort(v, left + 1, right);
    quicksort(v, left, right - 1);
}

void insertionSort(vector<int> &v, int n)
{
    for (int i = 1; i < n; i++)
    {
        int key = v[i];
        int j = i - 1;

        while (j >= 0)
        {
            if (v[j] <= key)
                break;

            v[j + 1] = v[j];
            j--;
        }
        v[j + 1] = key;
    }
}

int main()
{
    vector<int> v = {5, 4, 3, 2, 1};

    // quicksort(v, 0, v.size() - 1);
    insertionSort(v, v.size());

    for (int i = 0; i < v.size(); i++)
        cout << v[i] << " ";

    return 0;
}
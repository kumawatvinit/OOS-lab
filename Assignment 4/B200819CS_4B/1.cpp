#include <bits/stdc++.h>
using namespace std;

// Huffman tree node
struct Node
{
    char data;
    int frequency;
    Node *left;
    Node *right;
};

// Custom comparator for the priority queue
struct Compare
{
    bool operator()(Node *a, Node *b)
    {
        return a->frequency > b->frequency;
    }
};

// Generate Huffman codes
void generateHuffmanCodes(Node *root, string code, map<char, string> &huffmanCodes)
{
    if (root == nullptr)
        return;

    // If the node is a leaf, add its code to the huffmanCodes map
    if (!root->left && !root->right)
    {
        huffmanCodes[root->data] = code;
    }

    generateHuffmanCodes(root->left, code + "0", huffmanCodes);
    generateHuffmanCodes(root->right, code + "1", huffmanCodes);
}

// Build Huffman tree
Node *buildHuffmanTree(map<char, int> &frequencies)
{
    priority_queue<Node *, vector<Node *>, Compare> pq;

    // Create leaf nodes from characters and frequencies
    for (auto it = frequencies.begin(); it != frequencies.end(); it++)
    {
        Node *node = new Node;
        node->data = it->first;
        node->frequency = it->second;
        node->left = nullptr;
        node->right = nullptr;
        pq.push(node);
    }

    // Build the tree by merging nodes
    while (pq.size() > 1)
    {
        Node *left = pq.top();
        pq.pop();
        Node *right = pq.top();
        pq.pop();

        Node *newNode = new Node;
        newNode->data = '$'; // Internal node marker
        newNode->frequency = left->frequency + right->frequency;
        newNode->left = left;
        newNode->right = right;
        pq.push(newNode);
    }

    // Return the root of the Huffman tree
    return pq.top();
}

int main()
{
    int T;
    cin >> T; // Number of test cases

    while (T--)
    {
        int N;
        cin >> N; // Number of characters

        string chars;
        cin.ignore();        // Consume the newline character from the previous input
        getline(cin, chars); // Read the characters line

        map<char, int> frequencies;

        for (int i = 0; i < N; i++)
        {
            int freq;
            cin >> freq;

            frequencies[chars[2 * i]] = freq;
        }

        // Build Huffman tree
        Node *root = buildHuffmanTree(frequencies);

        // Generate Huffman codes, here map is from a character to its Huffman code
        map<char, string> huffmanCodes;
        generateHuffmanCodes(root, "", huffmanCodes);

        vector<pair<char, string>> sortedFrequencies;

        // Sort the frequencies in ascending order of binary string
        for (auto it = huffmanCodes.begin(); it != huffmanCodes.end(); it++)
        {
            sortedFrequencies.push_back({it->first, it->second});
        }

        sort(sortedFrequencies.begin(), sortedFrequencies.end(), [](pair<char, string> a, pair<char, string> b) {
            return a.second < b.second;
        });

        // Print the Huffman codes
        for (auto it = sortedFrequencies.begin(); it != sortedFrequencies.end(); it++)
        {
            cout << it->first << " " << it->second << endl;
        }
    }

    return 0;
}

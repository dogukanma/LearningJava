import java.util.ArrayList;

class AddressManager {
  static boolean remove_address(ArrayList<Address> list, Address address) {
    if (!list.contains(address)) {
      System.out.println("Address list doesn't contain given address.");
      return false;
    }
    list.remove(address);
    return true;
  }

  static boolean add_address(ArrayList<Address> list, Address address) {
    if (list.contains(address)) {
      System.out.println("Address list already contains given address.");
      return false;
    }
    list.add(address);
    return true;
  }
}

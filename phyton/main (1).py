import ipaddress


def main():
    # Get the number of hosts from user input
    num_hosts = int(input("NUM DE HOSTS: "))
    # Get the IP address from user input
    ip_address = input("DIRECCION IP: ")

    # Choose the smallest possible host group size based on the number of hosts
    min_hosts = choose_min_group_size(num_hosts)
    if min_hosts is not None:
        print(f"GRUPO MINIMO DE HOSTS: {min_hosts}")
    else:
        print("NUMERO DE HOSTS NO VALIDO.")

    # Calculate the first IP address of the next network
    new_ip_address = add_to_ip_address(ip_address, min_hosts)
    print(f"Siguiente IP: {new_ip_address}")

    # Increment the original IP address by 1
    next_ip_address = increment_ip_address(ip_address)
    print(f"RANGO 1: {next_ip_address}")

    # Subtract 2 from the IP address obtained from add_to_ip_address
    subtract_result = subtract_two_from_ip_address(new_ip_address)
    print(f"RANGO 2: {subtract_result}")

    # Subtract 1 from the IP address obtained from add_to_ip_address
    previous_ip_address = subtract_from_ip_address(new_ip_address, 1)
    print(f"BROADCAST: {previous_ip_address}")

    # Calculate the subnet mask of the IP address
    subnet_mask = calculate_subnet_mask(min_hosts)
    print(f"MASCARA: {subnet_mask}")

    # Calculate the prefix length based on the subnet mask
    ones_count = count_ones_until_zero(subnet_mask)

    if ones_count is not None:
        print(f"PREFIX: {ones_count}")
    else:
        print(f"IP INVALIDO: {ip_address}")


def choose_min_group_size(num_hosts):
    numbers_array = [
        2, 4, 8, 16, 32, 64, 128, 256, 512, 1024,
        2048, 4096, 8192, 16384, 32768, 65536, 131072
    ]

    min_hosts = next((x for x in numbers_array if x > num_hosts + 2), None)
    return min_hosts


def add_to_ip_address(ip_address, value):
    try:
        # Convert the IP address to an ipaddress.IPv4Address object
        ip_obj = ipaddress.IPv4Address(ip_address)
        # Add the value to the IP address
        new_ip_obj = ip_obj + value
        # Convert the ipaddress.IPv4Address object back to a string IP address
        new_ip_address = str(new_ip_obj)
        return new_ip_address
    except ValueError:
        return "IP INVALIDO"


def increment_ip_address(ip_address):
    try:
        # Convert the IP address to an ipaddress.IPv4Address object
        ip_obj = ipaddress.IPv4Address(ip_address)
        # Add 1 to the IP address
        new_ip_obj = ip_obj + 1
        # Convert the ipaddress.IPv4Address object back to a string IP address
        new_ip_address = str(new_ip_obj)
        return new_ip_address
    except ValueError:
        return "IP INVALIDO"


def subtract_two_from_ip_address(ip_address):
    try:
        # Convert the IP address to an ipaddress.IPv4Address object
        ip_obj = ipaddress.IPv4Address(ip_address)
        # Subtract 2 from the IP address
        new_ip_obj = ip_obj - 2
        # Convert the ipaddress.IPv4Address object back to a string IP address
        new_ip_address = str(new_ip_obj)
        return new_ip_address
    except ValueError:
        return "IP INVALIDO"


def subtract_from_ip_address(ip_address, value):
    try:
        # Convert the IP address to an ipaddress.IPv4Address object
        ip_obj = ipaddress.IPv4Address(ip_address)
        # Subtract the value from the IP address
        new_ip_obj = ip_obj - value
        # Convert the ipaddress.IPv4Address object back to a string IP address
        new_ip_address = str(new_ip_obj)
        return new_ip_address
    except ValueError:
        return "IP INVALIDO"


def calculate_subnet_mask(min_hosts):
    try:
        # Convert the subnet mask IP address to an ipaddress.IPv4Address object
        subnet_mask_obj = ipaddress.IPv4Address('255.255.255.255')
        # Subtract the min_hosts value from the subnet mask IP address
        new_subnet_mask_obj = subnet_mask_obj - min_hosts + 1
        # Convert the ipaddress.IPv4Address object back to a string IP address
        subnet_mask = str(new_subnet_mask_obj)
        return subnet_mask
    except ValueError:
        return "IP INVALIDO"


def count_ones_until_zero(ip_address):
    try:
        ip = ipaddress.IPv4Address(ip_address)
        binary_ip = bin(int(ip))[2:].zfill(32)  # Convert IP address to binary form
        count = 0

        for bit in binary_ip:
            if bit == '1':
                count += 1
            else:
                break

        return count 
    except ipaddress.AddressValueError:
        return None


main()
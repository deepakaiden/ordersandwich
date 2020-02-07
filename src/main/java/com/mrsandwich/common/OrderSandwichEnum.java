package com.mrsandwich.common;

/**
 * OrderSandwich is the enum for the maintaining the values of the Role type of
 * the user, admin.
 * 
 * @author Govindasamy.C
 * @since 07-02-2020
 * @version V1.1
 *
 */
public class OrderSandwichEnum {

	/**
	 * Maintaining the role type such as admin and user
	 * 
	 * @author Govindasamy
	 * @since 07-02-2020
	 */
	public enum Role {
		ADMIN, CUSTOMER;

	}

	/**
	 * Maintaining the item type such as veg and non-veg
	 * 
	 * @author Govindasamy
	 * @since 07-02-2020
	 */
	public enum ItemType {
		VEG, NON_VEG;
	}

	/**
	 * Maintaining the item status type such as available and unavailable
	 * 
	 * @author Govindasamy
	 * @since 07-02-2020
	 */
	public enum ItemStatus {
		AVAILABLE, UNAVAILABLE;

	}

	/**
	 * Maintaining the item order status type such as Ordered, Pending, Cancelled
	 * 
	 * @author Govindasamy
	 * @since 07-02-2020
	 */
	public enum OrderStatus {
		ORDERED, PENDING, CANCELLED;

	}

	/**
	 * Maintaining the payment types such as PayTm and PhonePe types.
	 * 
	 * @author Govindasamy
	 * @since 07-02-2020
	 */
	public enum PaymentType {

		PAYTM, PHONEPE;
	}
}

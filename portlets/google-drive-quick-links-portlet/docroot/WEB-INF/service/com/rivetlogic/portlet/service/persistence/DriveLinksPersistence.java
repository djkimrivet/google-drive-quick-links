/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.portlet.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.rivetlogic.portlet.model.DriveLinks;

/**
 * The persistence interface for the drive links service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author charlesrodriguez
 * @see DriveLinksPersistenceImpl
 * @see DriveLinksUtil
 * @generated
 */
public interface DriveLinksPersistence extends BasePersistence<DriveLinks> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DriveLinksUtil} to access the drive links persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the drive linkses where USER_ID = &#63;.
	*
	* @param USER_ID the u s e r_ i d
	* @return the matching drive linkses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.portlet.model.DriveLinks> findByUserId(
		java.lang.String USER_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the drive linkses where USER_ID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.portlet.model.impl.DriveLinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param USER_ID the u s e r_ i d
	* @param start the lower bound of the range of drive linkses
	* @param end the upper bound of the range of drive linkses (not inclusive)
	* @return the range of matching drive linkses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.portlet.model.DriveLinks> findByUserId(
		java.lang.String USER_ID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the drive linkses where USER_ID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.portlet.model.impl.DriveLinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param USER_ID the u s e r_ i d
	* @param start the lower bound of the range of drive linkses
	* @param end the upper bound of the range of drive linkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching drive linkses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.portlet.model.DriveLinks> findByUserId(
		java.lang.String USER_ID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first drive links in the ordered set where USER_ID = &#63;.
	*
	* @param USER_ID the u s e r_ i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching drive links
	* @throws com.rivetlogic.portlet.NoSuchDriveLinksException if a matching drive links could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.portlet.model.DriveLinks findByUserId_First(
		java.lang.String USER_ID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.portlet.NoSuchDriveLinksException;

	/**
	* Returns the first drive links in the ordered set where USER_ID = &#63;.
	*
	* @param USER_ID the u s e r_ i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching drive links, or <code>null</code> if a matching drive links could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.portlet.model.DriveLinks fetchByUserId_First(
		java.lang.String USER_ID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last drive links in the ordered set where USER_ID = &#63;.
	*
	* @param USER_ID the u s e r_ i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching drive links
	* @throws com.rivetlogic.portlet.NoSuchDriveLinksException if a matching drive links could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.portlet.model.DriveLinks findByUserId_Last(
		java.lang.String USER_ID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.portlet.NoSuchDriveLinksException;

	/**
	* Returns the last drive links in the ordered set where USER_ID = &#63;.
	*
	* @param USER_ID the u s e r_ i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching drive links, or <code>null</code> if a matching drive links could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.portlet.model.DriveLinks fetchByUserId_Last(
		java.lang.String USER_ID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the drive linkses before and after the current drive links in the ordered set where USER_ID = &#63;.
	*
	* @param driveLinksPK the primary key of the current drive links
	* @param USER_ID the u s e r_ i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next drive links
	* @throws com.rivetlogic.portlet.NoSuchDriveLinksException if a drive links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.portlet.model.DriveLinks[] findByUserId_PrevAndNext(
		com.rivetlogic.portlet.service.persistence.DriveLinksPK driveLinksPK,
		java.lang.String USER_ID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.portlet.NoSuchDriveLinksException;

	/**
	* Removes all the drive linkses where USER_ID = &#63; from the database.
	*
	* @param USER_ID the u s e r_ i d
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(java.lang.String USER_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of drive linkses where USER_ID = &#63;.
	*
	* @param USER_ID the u s e r_ i d
	* @return the number of matching drive linkses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(java.lang.String USER_ID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the drive links in the entity cache if it is enabled.
	*
	* @param driveLinks the drive links
	*/
	public void cacheResult(com.rivetlogic.portlet.model.DriveLinks driveLinks);

	/**
	* Caches the drive linkses in the entity cache if it is enabled.
	*
	* @param driveLinkses the drive linkses
	*/
	public void cacheResult(
		java.util.List<com.rivetlogic.portlet.model.DriveLinks> driveLinkses);

	/**
	* Creates a new drive links with the primary key. Does not add the drive links to the database.
	*
	* @param driveLinksPK the primary key for the new drive links
	* @return the new drive links
	*/
	public com.rivetlogic.portlet.model.DriveLinks create(
		com.rivetlogic.portlet.service.persistence.DriveLinksPK driveLinksPK);

	/**
	* Removes the drive links with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param driveLinksPK the primary key of the drive links
	* @return the drive links that was removed
	* @throws com.rivetlogic.portlet.NoSuchDriveLinksException if a drive links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.portlet.model.DriveLinks remove(
		com.rivetlogic.portlet.service.persistence.DriveLinksPK driveLinksPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.portlet.NoSuchDriveLinksException;

	public com.rivetlogic.portlet.model.DriveLinks updateImpl(
		com.rivetlogic.portlet.model.DriveLinks driveLinks)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the drive links with the primary key or throws a {@link com.rivetlogic.portlet.NoSuchDriveLinksException} if it could not be found.
	*
	* @param driveLinksPK the primary key of the drive links
	* @return the drive links
	* @throws com.rivetlogic.portlet.NoSuchDriveLinksException if a drive links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.portlet.model.DriveLinks findByPrimaryKey(
		com.rivetlogic.portlet.service.persistence.DriveLinksPK driveLinksPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.portlet.NoSuchDriveLinksException;

	/**
	* Returns the drive links with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param driveLinksPK the primary key of the drive links
	* @return the drive links, or <code>null</code> if a drive links with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.portlet.model.DriveLinks fetchByPrimaryKey(
		com.rivetlogic.portlet.service.persistence.DriveLinksPK driveLinksPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the drive linkses.
	*
	* @return the drive linkses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.portlet.model.DriveLinks> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the drive linkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.portlet.model.impl.DriveLinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of drive linkses
	* @param end the upper bound of the range of drive linkses (not inclusive)
	* @return the range of drive linkses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.portlet.model.DriveLinks> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the drive linkses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.portlet.model.impl.DriveLinksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of drive linkses
	* @param end the upper bound of the range of drive linkses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of drive linkses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.portlet.model.DriveLinks> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the drive linkses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of drive linkses.
	*
	* @return the number of drive linkses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}
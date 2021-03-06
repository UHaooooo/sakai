/**********************************************************************************
 *
 * Copyright (c) 2015 The Sakai Foundation
 *
 * Original developers:
 *
 *   New York University
 *   Payten Giles
 *   Mark Triggs
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.pasystem.api;

/**
 * Methods implemented by things that can be marked as acknowledged (popups and banners).
 */
public interface Acknowledger {
    /**
     * Mark an item as acknowledged with a type-appropriate acknowledgement type.
     */
    public void acknowledge(final String uuid, final String userId);

    /**
     * Mark an item as acknowledged with a specific acknowledgement type.
     */
    public void acknowledge(final String uuid, final String userId, final AcknowledgementType acknowledgementType);
}

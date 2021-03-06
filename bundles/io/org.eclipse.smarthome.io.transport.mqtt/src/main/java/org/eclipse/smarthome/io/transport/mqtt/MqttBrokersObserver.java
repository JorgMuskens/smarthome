/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.io.transport.mqtt;

/**
 * Implement this interface to get notified of new and removed Mqtt brokers.
 * Register this observer at {@see MqttService}.
 *
 * @author David Graeff - Initial contribution and API
 */
public interface MqttBrokersObserver {
    /**
     * Called, if a new broker has been added to the {@see MqttService}.
     * If a broker connection is replaced, you will be notified by a brokerRemoved call,
     * followed by a brokerAdded call.
     *
     * @param broker The new broker connection
     */
    void brokerAdded(MqttBrokerConnection broker);

    /**
     * Called, if a broker has been removed from the {@see MqttService}.
     *
     * @param broker The removed broker connection.
     *            The broker can still be connected, please unsubscribe from all topics and unregister
     *            all your listeners.
     */
    void brokerRemoved(MqttBrokerConnection broker);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto.server.database;

import org.springframework.data.repository.CrudRepository;
import progetto.server.database.table.Subscription;

/**
 *
 * @author sandro
 */
public interface SubscriptionRepository extends CrudRepository<Subscription, Integer> {

    Subscription findByIdAndUserId(Integer id, Integer user_id);

    Iterable<Subscription> findByUserId(Integer userId);

}

package br.com.william.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

	/**
	 * ID
	 * Usuário (ID_USUARIO)
	 * Descrição
	 * Título
	 * Data de inicio
	 * Data de término
	 * Prioridade
	 */
	
@Entity(name = "tb_tasks")
public class TaskModel {
	
	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;
	private String description;
	
	@Column(length = 50)
	private String title;
	private LocalDateTime startAt;
	private LocalDateTime endAt;
	private String priority;
	
	private UUID idUser;	
	
	@CreationTimestamp
	private LocalDateTime createdAt;
	

	public void setTitle1(String title) throws Exception {
		if(title.length()>50) {
			throw new Exception("O campo Title deve conter no máximo 50 caracteres");
		}
		this.title = title;
	}
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDateTime getStartAt() {
		return startAt;
	}

	public void setStartAt(LocalDateTime startAt) {
		this.startAt = startAt;
	}

	public LocalDateTime getEndAt() {
		return endAt;
	}

	public void setEndAt(LocalDateTime endAt) {
		this.endAt = endAt;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public UUID getIdUser() {
		return idUser;
	}

	public void setIdUser(UUID idUser) {
		this.idUser = idUser;
	}
	
	
}

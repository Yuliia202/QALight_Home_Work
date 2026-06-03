package aqa_hw9.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) // Це найважливіша частина!
public class PetDto {
    private int id;

    private CategoryDto category;

    private String name;

    private List<String> photoUrls;

    private List<TagDto> tags;

    private String status;
    public PetDto(int id, CategoryDto category, String name, List<String> photoUrls) {}

    public PetDto(int id, CategoryDto category, String name, List<String> photoUrls, List<TagDto> tags, String status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    public PetDto(int id, CategoryDto category, String name, String status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.status = status;
    }

    public PetDto() {
    }

    public int getId() {
        return id;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public List<TagDto> getTags() {
        return tags;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public void setTags(List<TagDto> tags) {
        this.tags = tags;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PetDto{" +
                "id=" + id +
                ", category=" + category +
                ", name='" + name + '\'' +
                ", photoUrls=" + photoUrls +
                ", tags=" + tags +
                ", status='" + status + '\'' +
                '}';
    }
}

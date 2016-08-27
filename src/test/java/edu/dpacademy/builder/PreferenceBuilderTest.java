package edu.dpacademy.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PreferenceBuilderTest {

    @Test
    public void createPreference() throws Exception {

        PreferenceBuilder builder = new PreferenceBuilder();

        int mockId = 1;
        String categoryName = "category-name";
        String internalName = "internal-name";
        String displayName = "display-name";
        Long value = Long.valueOf(20);
        Preference preference = builder
                .setId(mockId)
                .setCategoryName(categoryName)
                .setInternalName(internalName)
                .setDisplayName(displayName)
                .setValue(value)
                .createPreference();

        assertEquals(mockId, preference.getId());
        assertEquals(categoryName, preference.getCategoryName());
        assertEquals(internalName, preference.getInternalName());
        assertEquals(displayName, preference.getDisplayName());
        assertEquals(value, preference.getValue());

    }

}
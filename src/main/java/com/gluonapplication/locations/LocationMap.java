package com.gluonapplication.locations;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.net.URI;
import java.util.Set;

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class LocationMap implements Map{

    private String locationName;
    private boolean activeLocation = true;
    private URI locationImageURI;
    private Set<FishingPoint> FishingPoints;
}

package com.github.junrar.volume;

import com.github.junrar.Archive;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class InputStreamVolumeManager implements VolumeManager {
    private final Map<Integer, InputStream> streams;

    public InputStreamVolumeManager(List<InputStream> list) {
        this.streams = new HashMap();
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 1;
            this.streams.put(Integer.valueOf(i2), list.get(i));
            i = i2;
        }
    }

    @Override // com.github.junrar.volume.VolumeManager
    public Volume nextVolume(Archive archive, Volume volume) {
        if (volume == null) {
            return new InputStreamVolume(archive, this.streams.get(1), 1);
        }
        int position = ((InputStreamVolume) volume).getPosition() + 1;
        InputStream inputStream = this.streams.get(Integer.valueOf(position));
        if (inputStream != null) {
            return new InputStreamVolume(archive, inputStream, position);
        }
        return null;
    }

    public InputStreamVolumeManager(InputStream inputStream) {
        HashMap hashMap = new HashMap();
        this.streams = hashMap;
        hashMap.put(1, inputStream);
    }
}

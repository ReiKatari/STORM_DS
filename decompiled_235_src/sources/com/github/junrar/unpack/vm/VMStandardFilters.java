package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum VMStandardFilters {
    VMSF_NONE(0),
    VMSF_E8(1),
    VMSF_E8E9(2),
    VMSF_ITANIUM(3),
    VMSF_RGB(4),
    VMSF_AUDIO(5),
    VMSF_DELTA(6),
    VMSF_UPCASE(7);
    
    private final int filter;

    VMStandardFilters(int i) {
        this.filter = i;
    }

    public static VMStandardFilters findFilter(int i) {
        VMStandardFilters vMStandardFilters = VMSF_NONE;
        if (vMStandardFilters.equals(i)) {
            return vMStandardFilters;
        }
        VMStandardFilters vMStandardFilters2 = VMSF_E8;
        if (vMStandardFilters2.equals(i)) {
            return vMStandardFilters2;
        }
        VMStandardFilters vMStandardFilters3 = VMSF_E8E9;
        if (vMStandardFilters3.equals(i)) {
            return vMStandardFilters3;
        }
        VMStandardFilters vMStandardFilters4 = VMSF_ITANIUM;
        if (vMStandardFilters4.equals(i)) {
            return vMStandardFilters4;
        }
        VMStandardFilters vMStandardFilters5 = VMSF_RGB;
        if (vMStandardFilters5.equals(i)) {
            return vMStandardFilters5;
        }
        VMStandardFilters vMStandardFilters6 = VMSF_AUDIO;
        if (vMStandardFilters6.equals(i)) {
            return vMStandardFilters6;
        }
        VMStandardFilters vMStandardFilters7 = VMSF_DELTA;
        if (vMStandardFilters7.equals(i)) {
            return vMStandardFilters7;
        }
        VMStandardFilters vMStandardFilters8 = VMSF_UPCASE;
        if (vMStandardFilters8.equals(i)) {
            return vMStandardFilters8;
        }
        return null;
    }

    public boolean equals(int i) {
        if (this.filter == i) {
            return true;
        }
        return false;
    }

    public int getFilter() {
        return this.filter;
    }
}

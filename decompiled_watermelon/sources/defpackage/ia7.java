package defpackage;

import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ia7  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ia7 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BackgroundMode.values().length];
        try {
            iArr[BackgroundMode.STRETCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BackgroundMode.FIT_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BackgroundMode.FIT_TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BackgroundMode.FIT_BOTTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BackgroundMode.FIT_LEFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BackgroundMode.FIT_RIGHT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}

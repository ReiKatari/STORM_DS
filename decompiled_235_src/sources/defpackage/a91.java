package defpackage;

import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a91  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a91 {
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
            iArr[BackgroundMode.FIT_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BackgroundMode.FIT_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BackgroundMode.FIT_TOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BackgroundMode.FIT_BOTTOM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}

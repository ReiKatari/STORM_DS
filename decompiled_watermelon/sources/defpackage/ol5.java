package defpackage;

import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ol5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ol5 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[lm5.values().length];
        try {
            iArr[lm5.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lm5.GbaRom.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lm5.RumblePak.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[lm5.MemoryExpansion.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[lm5.AnalogInput.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[VideoRenderer.values().length];
        try {
            iArr2[VideoRenderer.VULKAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}

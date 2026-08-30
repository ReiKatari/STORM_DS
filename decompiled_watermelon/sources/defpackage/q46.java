package defpackage;

import me.magnum.melonds.domain.model.RetroArchShaderSource;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q46  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q46 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[RetroArchShaderSource.values().length];
        try {
            iArr[RetroArchShaderSource.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RetroArchShaderSource.FOLDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[dt5.values().length];
        try {
            iArr2[dt5.SAVE_DIR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[dt5.ROM_DIR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[dt5.INTERNAL_DIR.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[VideoRenderer.values().length];
        try {
            iArr3[VideoRenderer.OPENGL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[VideoRenderer.COMPUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
    }
}

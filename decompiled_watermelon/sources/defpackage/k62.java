package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k62  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class k62 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ConsoleType.values().length];
        try {
            iArr[ConsoleType.DS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConsoleType.DSi.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

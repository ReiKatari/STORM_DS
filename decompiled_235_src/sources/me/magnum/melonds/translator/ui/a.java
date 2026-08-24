package me.magnum.melonds.translator.ui;

import me.magnum.melonds.translator.ui.GameTranslationOverlayView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GameTranslationOverlayView.a.values().length];
        try {
            iArr[GameTranslationOverlayView.a.DRAW_NEW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GameTranslationOverlayView.a.MOVE_REGION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GameTranslationOverlayView.a.RESIZE_REGION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

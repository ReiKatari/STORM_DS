package me.magnum.melonds.ui.settings.fragments;

import java.util.Comparator;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1$invokeSuspend$lambda$1$$inlined$sortedBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Locale locale = Locale.ROOT;
        String lowerCase = ((String) ((vr4) obj).A).toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((vr4) obj2).A).toLowerCase(locale);
        lowerCase2.getClass();
        return g04.z(lowerCase, lowerCase2);
    }
}

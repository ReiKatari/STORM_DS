package me.magnum.melonds.ui.settings.fragments;

import java.util.Comparator;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class VideoPreferencesFragment$loadShaderBrowserDirectory$2$items$1$invokeSuspend$lambda$1$$inlined$sortedBy$2<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Locale locale = Locale.ROOT;
        String lowerCase = ((String) ((ti4) obj).A).toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((ti4) obj2).A).toLowerCase(locale);
        lowerCase2.getClass();
        return iq2.i(lowerCase, lowerCase2);
    }
}

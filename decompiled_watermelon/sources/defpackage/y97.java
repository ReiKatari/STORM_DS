package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y97  reason: default package */
/* loaded from: classes.dex */
public abstract class y97 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static o01 b(View view, o01 o01Var) {
        ContentInfo B = o01Var.a.B();
        Objects.requireNonNull(B);
        ContentInfo performReceiveContent = view.performReceiveContent(B);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == B) {
            return o01Var;
        }
        return new o01(new bq0(performReceiveContent));
    }
}

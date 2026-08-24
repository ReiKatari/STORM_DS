package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gs  reason: default package */
/* loaded from: classes.dex */
public abstract class gs {
    public static android.view.textclassifier.TextClassifier a(android.widget.TextView r1) {
            android.content.Context r1 = r1.getContext()
            java.lang.Class<android.view.textclassifier.TextClassificationManager> r0 = android.view.textclassifier.TextClassificationManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.textclassifier.TextClassificationManager r1 = (android.view.textclassifier.TextClassificationManager) r1
            if (r1 == 0) goto L13
            android.view.textclassifier.TextClassifier r1 = r1.getTextClassifier()
            return r1
        L13:
            android.view.textclassifier.TextClassifier r1 = android.view.textclassifier.TextClassifier.NO_OP
            return r1
    }
}

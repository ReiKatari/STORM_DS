package defpackage;

import android.view.textclassifier.TextClassification;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: no6  reason: default package */
/* loaded from: classes.dex */
public final class no6 extends yn6 {
    public final TextClassification b;
    public final int c;

    public no6(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.b = textClassification;
        this.c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.a);
        sb.append(", textClassification=");
        sb.append(this.b);
        sb.append(", index=");
        return ej6.g(sb, this.c, ')');
    }
}

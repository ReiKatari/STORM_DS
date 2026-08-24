package defpackage;

import android.view.textclassifier.TextClassification;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y07  reason: default package */
/* loaded from: classes.dex */
public final class y07 extends k07 {
    public final TextClassification b;
    public final int c;

    public y07(Object obj, TextClassification textClassification, int i) {
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
        return xg6.q(sb, this.c, ')');
    }
}

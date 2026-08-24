package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r86  reason: default package */
/* loaded from: classes.dex */
public final class r86 implements android.widget.TextView.OnEditorActionListener {
    public final /* synthetic */ androidx.appcompat.widget.SearchView a;

    public r86(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            androidx.appcompat.widget.SearchView r0 = r0.a
            r0.q()
            r0 = 1
            return r0
    }
}

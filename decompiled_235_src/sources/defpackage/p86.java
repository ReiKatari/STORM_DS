package defpackage;

import androidx.appcompat.widget.SearchView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p86  reason: default package */
/* loaded from: classes.dex */
public final class p86 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ SearchView B;

    public /* synthetic */ p86(SearchView searchView, int i) {
        this.A = i;
        this.B = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        SearchView searchView = this.B;
        switch (i) {
            case 0:
                searchView.s();
                return;
            default:
                z71 z71Var = searchView.O0;
                if (z71Var instanceof du6) {
                    z71Var.b(null);
                    return;
                }
                return;
        }
    }
}

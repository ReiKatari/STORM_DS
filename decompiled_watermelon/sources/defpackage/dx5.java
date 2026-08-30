package defpackage;

import androidx.appcompat.widget.SearchView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dx5  reason: default package */
/* loaded from: classes.dex */
public final class dx5 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ SearchView B;

    public /* synthetic */ dx5(SearchView searchView, int i) {
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
                p41 p41Var = searchView.N0;
                if (p41Var instanceof ji6) {
                    p41Var.b(null);
                    return;
                }
                return;
        }
    }
}

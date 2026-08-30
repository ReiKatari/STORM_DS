package f2;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends ec.j implements mc.p {
    public id.c X;
    public p Y;
    public CharSequence Z;

    /* renamed from: b0  reason: collision with root package name */
    public long f4759b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f4760c0;

    /* renamed from: d0  reason: collision with root package name */
    public /* synthetic */ Object f4761d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ CharSequence f4762e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ long f4763f0;

    /* renamed from: g0  reason: collision with root package name */
    public final /* synthetic */ p f4764g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j2, cc.c cVar, p pVar, CharSequence charSequence) {
        super(2, cVar);
        this.f4762e0 = charSequence;
        this.f4763f0 = j2;
        this.f4764g0 = pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((o) t((cc.c) obj2, c3.p.m(obj))).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        o oVar = new o(this.f4763f0, cVar, this.f4764g0, this.f4762e0);
        oVar.f4761d0 = obj;
        return oVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        TextSelection.Request.Builder defaultLocales;
        TextSelection.Request build;
        TextSelection suggestSelection;
        int selectionStartIndex;
        int selectionEndIndex;
        long j2;
        TextClassification textClassification;
        id.c cVar;
        CharSequence charSequence;
        TextSelection textSelection;
        p pVar;
        TextClassification textClassification2;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.f4760c0;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    j2 = this.f4759b0;
                    p7.j.I(obj);
                } else {
                    a0.j.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                j2 = this.f4759b0;
                charSequence = this.Z;
                pVar = this.Y;
                cVar = this.X;
                textSelection = c3.p.n(this.f4761d0);
                p7.j.I(obj);
                try {
                    textClassification2 = textSelection.getTextClassification();
                    textClassification2.getClass();
                    pVar.f4774g.setValue(new o0(charSequence, j2, textClassification2));
                } finally {
                    cVar.d(null);
                }
            }
        } else {
            p7.j.I(obj);
            TextClassifier m = c3.p.m(this.f4761d0);
            a6.j.B();
            long j10 = this.f4763f0;
            int f8 = l4.q0.f(j10);
            int e6 = l4.q0.e(j10);
            CharSequence charSequence2 = this.f4762e0;
            TextSelection.Request.Builder n10 = a6.j.n(charSequence2, f8, e6);
            p pVar2 = this.f4764g0;
            defaultLocales = n10.setDefaultLocales(pVar2.b());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            build = defaultLocales.build();
            suggestSelection = m.suggestSelection(build);
            selectionStartIndex = suggestSelection.getSelectionStartIndex();
            selectionEndIndex = suggestSelection.getSelectionEndIndex();
            long b10 = l4.i0.b(selectionStartIndex, selectionEndIndex);
            if (i10 >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    id.c cVar2 = pVar2.f4772e;
                    this.f4761d0 = suggestSelection;
                    this.X = cVar2;
                    this.Y = pVar2;
                    this.Z = charSequence2;
                    this.f4759b0 = b10;
                    this.f4760c0 = 1;
                    if (cVar2.i(this) != aVar) {
                        cVar = cVar2;
                        charSequence = charSequence2;
                        textSelection = suggestSelection;
                        pVar = pVar2;
                        j2 = b10;
                        textClassification2 = textSelection.getTextClassification();
                        textClassification2.getClass();
                        pVar.f4774g.setValue(new o0(charSequence, j2, textClassification2));
                    }
                    return aVar;
                }
            }
            this.f4759b0 = b10;
            this.f4760c0 = 2;
            if (p.a(this.f4764g0, this.f4762e0, b10, m, this) != aVar) {
                j2 = b10;
            }
            return aVar;
        }
        return new l4.q0(j2);
    }
}

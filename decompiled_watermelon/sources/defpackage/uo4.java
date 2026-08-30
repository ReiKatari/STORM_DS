package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uo4  reason: default package */
/* loaded from: classes.dex */
public final class uo4 extends nk6 implements aj2 {
    public b34 X;
    public vo4 Y;
    public CharSequence Z;
    public long c0;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ CharSequence f0;
    public final /* synthetic */ long g0;
    public final /* synthetic */ vo4 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo4(long j, j11 j11Var, vo4 vo4Var, CharSequence charSequence) {
        super(2, j11Var);
        this.f0 = charSequence;
        this.g0 = j;
        this.h0 = vo4Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((uo4) t((j11) obj2, go4.j(obj))).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        uo4 uo4Var = new uo4(this.g0, j11Var, this.h0, this.f0);
        uo4Var.e0 = obj;
        return uo4Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        TextSelection.Request.Builder defaultLocales;
        TextSelection.Request build;
        TextSelection suggestSelection;
        int selectionStartIndex;
        int selectionEndIndex;
        long j;
        TextClassification textClassification;
        b34 b34Var;
        CharSequence charSequence;
        TextSelection textSelection;
        vo4 vo4Var;
        TextClassification textClassification2;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.d0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    j = this.c0;
                    me2.a0(obj);
                } else {
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                j = this.c0;
                charSequence = this.Z;
                vo4Var = this.Y;
                b34Var = this.X;
                textSelection = go4.k(this.e0);
                me2.a0(obj);
                try {
                    textClassification2 = textSelection.getTextClassification();
                    textClassification2.getClass();
                    vo4Var.g.setValue(new vn6(charSequence, j, textClassification2));
                } finally {
                    b34Var.d(null);
                }
            }
        } else {
            me2.a0(obj);
            TextClassifier j2 = go4.j(this.e0);
            on1.C();
            long j3 = this.g0;
            int f = vr6.f(j3);
            int e = vr6.e(j3);
            CharSequence charSequence2 = this.f0;
            TextSelection.Request.Builder q = on1.q(charSequence2, f, e);
            vo4 vo4Var2 = this.h0;
            defaultLocales = q.setDefaultLocales(vo4Var2.b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            build = defaultLocales.build();
            suggestSelection = j2.suggestSelection(build);
            selectionStartIndex = suggestSelection.getSelectionStartIndex();
            selectionEndIndex = suggestSelection.getSelectionEndIndex();
            long g = ve2.g(selectionStartIndex, selectionEndIndex);
            if (i2 >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    b34 b34Var2 = vo4Var2.e;
                    this.e0 = suggestSelection;
                    this.X = b34Var2;
                    this.Y = vo4Var2;
                    this.Z = charSequence2;
                    this.c0 = g;
                    this.d0 = 1;
                    if (b34Var2.i(this) != p31Var) {
                        b34Var = b34Var2;
                        charSequence = charSequence2;
                        textSelection = suggestSelection;
                        vo4Var = vo4Var2;
                        j = g;
                        textClassification2 = textSelection.getTextClassification();
                        textClassification2.getClass();
                        vo4Var.g.setValue(new vn6(charSequence, j, textClassification2));
                    }
                    return p31Var;
                }
            }
            this.c0 = g;
            this.d0 = 2;
            if (vo4.a(this.h0, this.f0, g, j2, this) != p31Var) {
                j = g;
            }
            return p31Var;
        }
        return new vr6(j);
    }
}

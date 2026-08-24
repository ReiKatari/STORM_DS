package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yx4  reason: default package */
/* loaded from: classes.dex */
public final class yx4 extends hw6 implements eo2 {
    public hb4 X;
    public zx4 Y;
    public CharSequence Z;
    public long d0;
    public int e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ CharSequence g0;
    public final /* synthetic */ long h0;
    public final /* synthetic */ zx4 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx4(long j, r41 r41Var, zx4 zx4Var, CharSequence charSequence) {
        super(2, r41Var);
        this.g0 = charSequence;
        this.h0 = j;
        this.i0 = zx4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((yx4) q((r41) obj2, oc3.d(obj))).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        yx4 yx4Var = new yx4(this.h0, r41Var, this.i0, this.g0);
        yx4Var.f0 = obj;
        return yx4Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        TextSelection.Request.Builder defaultLocales;
        TextSelection.Request build;
        TextSelection suggestSelection;
        int selectionStartIndex;
        int selectionEndIndex;
        long j;
        TextClassification textClassification;
        hb4 hb4Var;
        CharSequence charSequence;
        TextSelection textSelection;
        zx4 zx4Var;
        TextClassification textClassification2;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.e0;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    j = this.d0;
                    oi2.Y(obj);
                } else {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                j = this.d0;
                charSequence = this.Z;
                zx4Var = this.Y;
                hb4Var = this.X;
                textSelection = oc3.e(this.f0);
                oi2.Y(obj);
                try {
                    textClassification2 = textSelection.getTextClassification();
                    textClassification2.getClass();
                    zx4Var.g.setValue(new h07(charSequence, j, textClassification2));
                } finally {
                    hb4Var.h(null);
                }
            }
        } else {
            oi2.Y(obj);
            TextClassifier d = oc3.d(this.f0);
            yr1.C();
            long j2 = this.h0;
            int f = k47.f(j2);
            int e = k47.e(j2);
            CharSequence charSequence2 = this.g0;
            TextSelection.Request.Builder q = yr1.q(charSequence2, f, e);
            zx4 zx4Var2 = this.i0;
            defaultLocales = q.setDefaultLocales(zx4Var2.b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            build = defaultLocales.build();
            suggestSelection = d.suggestSelection(build);
            selectionStartIndex = suggestSelection.getSelectionStartIndex();
            selectionEndIndex = suggestSelection.getSelectionEndIndex();
            long f2 = jx2.f(selectionStartIndex, selectionEndIndex);
            if (i2 >= 31) {
                textClassification = suggestSelection.getTextClassification();
                if (textClassification != null) {
                    hb4 hb4Var2 = zx4Var2.e;
                    this.f0 = suggestSelection;
                    this.X = hb4Var2;
                    this.Y = zx4Var2;
                    this.Z = charSequence2;
                    this.d0 = f2;
                    this.e0 = 1;
                    if (hb4Var2.e(this) != x61Var) {
                        hb4Var = hb4Var2;
                        charSequence = charSequence2;
                        textSelection = suggestSelection;
                        zx4Var = zx4Var2;
                        j = f2;
                        textClassification2 = textSelection.getTextClassification();
                        textClassification2.getClass();
                        zx4Var.g.setValue(new h07(charSequence, j, textClassification2));
                    }
                    return x61Var;
                }
            }
            this.d0 = f2;
            this.e0 = 2;
            if (zx4.a(this.i0, this.g0, f2, d, this) != x61Var) {
                j = f2;
            }
            return x61Var;
        }
        return new k47(j);
    }
}

package defpackage;

import android.app.Activity;
import android.content.res.TypedArray;
import android.util.TypedValue;
import androidx.compose.ui.platform.ComposeView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xp2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xp2 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ hq2 B;

    public /* synthetic */ xp2(hq2 hq2Var, int i) {
        this.A = i;
        this.B = hq2Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [o60, hr, android.app.Dialog] */
    @Override // defpackage.on2
    public final Object c() {
        int i;
        int i2 = this.A;
        jg7 jg7Var = jg7.a;
        hq2 hq2Var = this.B;
        switch (i2) {
            case 0:
                hq2Var.j(false);
                return jg7Var;
            case 1:
                String string = hq2Var.f.getString("translator_custom_ai_model", "gpt-4o-mini");
                if (string == null) {
                    return "";
                }
                return string;
            case 2:
                hq2Var.i();
                return jg7Var;
            case 3:
                hq2Var.h();
                return jg7Var;
            case 4:
                hq2Var.p.d("Бэтмен: Город под защитой. Лейтон: У каждой загадки есть разгадка!", "ru");
                return jg7Var;
            case 5:
                Activity activity = hq2Var.a;
                TypedValue typedValue = new TypedValue();
                if (activity.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true)) {
                    i = typedValue.resourceId;
                } else {
                    i = 2132017831;
                }
                ?? hrVar = new hr(activity, i);
                hrVar.g0 = true;
                hrVar.h0 = true;
                hrVar.m0 = new m60(hrVar);
                hrVar.f().i(1);
                TypedArray obtainStyledAttributes = hrVar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
                hrVar.k0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                TypedArray obtainStyledAttributes2 = hrVar.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
                hrVar.k0 = obtainStyledAttributes2.getBoolean(0, false);
                obtainStyledAttributes2.recycle();
                ComposeView composeView = new ComposeView(activity, null, 6);
                composeView.setContent(new zv0(1278803476, true, new yp2(hq2Var, hrVar, 1)));
                hrVar.setContentView(composeView);
                hrVar.show();
                return jg7Var;
            case 6:
                hq2Var.c();
                return jg7Var;
            case 7:
                String string2 = hq2Var.f.getString("translator_deepl_key", "");
                if (string2 == null) {
                    return "";
                }
                return string2;
            case 8:
                String string3 = hq2Var.f.getString("translator_custom_ai_key", "");
                if (string3 == null) {
                    return "";
                }
                return string3;
            default:
                String string4 = hq2Var.f.getString("translator_custom_ai_endpoint", "https://api.openai.com/v1/chat/completions");
                if (string4 == null) {
                    return "";
                }
                return string4;
        }
    }
}

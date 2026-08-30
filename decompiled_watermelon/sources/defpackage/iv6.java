package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iv6  reason: default package */
/* loaded from: classes.dex */
public final class iv6 extends ar {
    public Integer R;
    public Integer c0;

    public final Integer getDisabledDrawable() {
        return this.c0;
    }

    public final Integer getEnabledDrawable() {
        return this.R;
    }

    public final void setDisabledDrawable(Integer num) {
        this.c0 = num;
    }

    public final void setEnabledDrawable(Integer num) {
        this.R = num;
    }

    public final void setToggleState(boolean z) {
        Integer num;
        if (z) {
            num = this.R;
        } else {
            num = this.c0;
        }
        if (num != null) {
            setImageResource(num.intValue());
        }
    }
}

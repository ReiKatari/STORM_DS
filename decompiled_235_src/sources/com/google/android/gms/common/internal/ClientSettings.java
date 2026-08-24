package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ClientSettings {
    private final Account zaa;
    private final Set zab;
    private final Set zac;
    private final Map zad;
    private final int zae;
    private final View zaf;
    private final String zag;
    private final String zah;
    private final bi6 zai;
    private Integer zaj;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class Builder {
        private Account zaa;
        private zu zab;
        private String zac;
        private String zad;
        private final bi6 zae = bi6.a;

        public ClientSettings build() {
            return new ClientSettings(this.zaa, this.zab, null, 0, null, this.zac, this.zad, this.zae, false);
        }

        public Builder setRealClientPackageName(String str) {
            this.zac = str;
            return this;
        }

        public final Builder zaa(Collection collection) {
            if (this.zab == null) {
                this.zab = new zu(0);
            }
            this.zab.addAll(collection);
            return this;
        }

        public final Builder zab(Account account) {
            this.zaa = account;
            return this;
        }

        public final Builder zac(String str) {
            this.zad = str;
            return this;
        }
    }

    public ClientSettings(Account account, Set set, Map map, int i, View view, String str, String str2, bi6 bi6Var, boolean z) {
        Set unmodifiableSet;
        this.zaa = account;
        if (set == null) {
            unmodifiableSet = Collections.EMPTY_SET;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.zab = unmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.zad = map;
        this.zaf = view;
        this.zae = i;
        this.zag = str;
        this.zah = str2;
        this.zai = bi6Var == null ? bi6.a : bi6Var;
        HashSet hashSet = new HashSet(unmodifiableSet);
        for (zab zabVar : map.values()) {
            hashSet.addAll(zabVar.zaa);
        }
        this.zac = Collections.unmodifiableSet(hashSet);
    }

    public static ClientSettings createDefault(Context context) {
        return new GoogleApiClient.Builder(context).zaa();
    }

    public Account getAccount() {
        return this.zaa;
    }

    @Deprecated
    public String getAccountName() {
        Account account = this.zaa;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account getAccountOrDefault() {
        Account account = this.zaa;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", AccountType.GOOGLE);
    }

    public Set<Scope> getAllRequestedScopes() {
        return this.zac;
    }

    public Set<Scope> getApplicableScopes(Api<?> api) {
        zab zabVar = (zab) this.zad.get(api);
        if (zabVar != null && !zabVar.zaa.isEmpty()) {
            HashSet hashSet = new HashSet(this.zab);
            hashSet.addAll(zabVar.zaa);
            return hashSet;
        }
        return this.zab;
    }

    public int getGravityForPopups() {
        return this.zae;
    }

    public String getRealClientPackageName() {
        return this.zag;
    }

    public Set<Scope> getRequiredScopes() {
        return this.zab;
    }

    public View getViewForPopups() {
        return this.zaf;
    }

    public final bi6 zaa() {
        return this.zai;
    }

    public final Integer zab() {
        return this.zaj;
    }

    public final String zac() {
        return this.zah;
    }

    public final Map zad() {
        return this.zad;
    }

    public final void zae(Integer num) {
        this.zaj = num;
    }

    public ClientSettings(Account account, Set<Scope> set, Map<Api<?>, zab> map, int i, View view, String str, String str2, bi6 bi6Var) {
        this(account, set, map, i, view, str, str2, bi6Var, false);
    }
}

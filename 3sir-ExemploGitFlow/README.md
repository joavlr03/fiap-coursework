# 3sir-ExemploGitFlow
Exemplo de uso do GitFlow com GitHub para gerenciamento de processo de software e versionamento

##Comandos utilizados

$ dir
3sir-ExemploGitFlow

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT
$ git status
fatal: not a git repository (or any of the parent directories): .git

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT
$ git clone 3sir-ExemploGitFlow
fatal: destination path '3sir-ExemploGitFlow' already exists and is not an empty directory.

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT
$ cd 3sir-ExemploGitFlow

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (main)
$ git flow init

Which branch should be used for bringing forth production releases?
   - main
Branch name for production releases: [main]
Branch name for "next release" development: [develop]

How to name your supporting branch prefixes?
Feature branches? [feature/]
Bugfix branches? [bugfix/]
Release branches? [release/]
Hotfix branches? [hotfix/]
Support branches? [support/]
Version tag prefix? []
Hooks and filters directory? [D:/ProjetosGIT/3sir-ExemploGitFlow/.git/hooks]

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (develop)
$ git branch
* develop
  main

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (develop)
$ git flow feature start TarefaOrganizacaoProjeto
Switched to a new branch 'feature/TarefaOrganizacaoProjeto'

Summary of actions:
- A new branch 'feature/TarefaOrganizacaoProjeto' was created, based on 'develop'
- You are now on branch 'feature/TarefaOrganizacaoProjeto'

Now, start committing on your feature. When done, use:

     git flow feature finish TarefaOrganizacaoProjeto


labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (feature/TarefaOrganizacaoProjeto)
$ git status
On branch feature/TarefaOrganizacaoProjeto
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        PastaDocumentacaoProjeto/
        PastaFontesApp/

nothing added to commit but untracked files present (use "git add" to track)

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (feature/TarefaOrganizacaoProjeto)
$ git add .

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (feature/TarefaOrganizacaoProjeto)
$ git status
On branch feature/TarefaOrganizacaoProjeto
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
        new file:   PastaDocumentacaoProjeto/README.md
        new file:   PastaFontesApp/README.md


labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (feature/TarefaOrganizacaoProjeto)
$ git commit -m 'criacao de pastas para organizar o projeto'
[feature/TarefaOrganizacaoProjeto aa063af] criacao de pastas para organizar o projeto
 Committer: joavlr03 <labsfiap@fiap.com.br>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly:

    git config --global user.name "Your Name"
    git config --global user.email you@example.com

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 2 files changed, 5 insertions(+)
 create mode 100644 PastaDocumentacaoProjeto/README.md
 create mode 100644 PastaFontesApp/README.md

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (feature/TarefaOrganizacaoProjeto)
$ git status
On branch feature/TarefaOrganizacaoProjeto
nothing to commit, working tree clean

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (feature/TarefaOrganizacaoProjeto)
$ git branch
  develop
* feature/TarefaOrganizacaoProjeto
  main

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (feature/TarefaOrganizacaoProjeto)
$ git flow feature finish TarefaOrganizacaoProjeto
Switched to branch 'develop'
Updating 28c9801..aa063af
Fast-forward
 PastaDocumentacaoProjeto/README.md | 2 ++
 PastaFontesApp/README.md           | 3 +++
 2 files changed, 5 insertions(+)
 create mode 100644 PastaDocumentacaoProjeto/README.md
 create mode 100644 PastaFontesApp/README.md
Deleted branch feature/TarefaOrganizacaoProjeto (was aa063af).

Summary of actions:
- The feature branch 'feature/TarefaOrganizacaoProjeto' was merged into 'develop'
- Feature branch 'feature/TarefaOrganizacaoProjeto' has been locally deleted
- You are now on branch 'develop'


labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (develop)
$ git branch
* develop
  main

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (develop)
$ git push
fatal: The current branch develop has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin develop

To have this happen automatically for branches without a tracking
upstream, see 'push.autoSetupRemote' in 'git help config'.


labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (develop)
$ git push -u origin develop
warning: ----------------- SECURITY WARNING ----------------
warning: | TLS certificate verification has been disabled! |
warning: ---------------------------------------------------
warning: HTTPS connections may not be secure. See https://aka.ms/gcm/tlsverify for more information.
Enumerating objects: 7, done.
Counting objects: 100% (7/7), done.
Delta compression using up to 24 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (6/6), 651 bytes | 651.00 KiB/s, done.
Total 6 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
remote:
remote: Create a pull request for 'develop' on GitHub by visiting:
remote:      https://github.com/joavlr03/3sir-ExemploGitFlow/pull/new/develop
remote:
To https://github.com/joavlr03/3sir-ExemploGitFlow.git
 * [new branch]      develop -> develop
branch 'develop' set up to track 'origin/develop'.

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (develop)
$ git fetch
remote: Enumerating objects: 7, done.
remote: Counting objects: 100% (7/7), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 4 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
Unpacking objects: 100% (4/4), 1.07 KiB | 109.00 KiB/s, done.
From https://github.com/joavlr03/3sir-ExemploGitFlow
   aa063af..8af14ac  develop    -> origin/develop

labsfiap@L1710MICRO21 MINGW64 /d/ProjetosGIT/3sir-ExemploGitFlow (develop)
$ git pull --all
Updating aa063af..8af14ac
Fast-forward
 PastaFontesApp/README.md | 2 +-
 1 file changed, 1 insertion(+), 1 deletion(-)
